import { Component, OnInit } from '@angular/core';
import { Product } from '../../models/product';
import { Router } from '@angular/router';
import { LoginService } from '../../services/login.service';
import { GetProductListService } from '../../services/get-product-list.service';
import { RemoveProductService } from '../../services/remove-product.service';
import { MatDialog, MatDialogRef } from '@angular/material';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {

  private selectedProduct: Product;
  private checked: boolean;
  private productList: Product[];
  private allChecked: boolean;
  private removeProductList: Product[] = new Array(); 


  constructor(
  	private getProductListService: GetProductListService, 
  	private router: Router,
    private removeProductService: RemoveProductService,
    public dialog: MatDialog
  	) { }

  onSelect(product: Product) {
    this.selectedProduct = product;
    this.router.navigate(['/viewProduct', this.selectedProduct.id]);
  }

  openDialog(product: Product) {
    let dialogRef = this.dialog.open(DialogResultExampleDialog);
    dialogRef.afterClosed().subscribe(
      result => {
        console.log(result);
        if(result=="yes") {
          this.removeProductService.sendProduct(product.id).subscribe(
            res => {
              console.log(res);
              this.getProductList();
            }, 
            err => {
              console.log(err);
            }
            );
        }
      }
      );
  }

  updateRemoveProductList(checked:boolean, product:Product) {
    if(checked) {
      this.removeProductList.push(product);
    } else {
      this.removeProductList.splice(this.removeProductList.indexOf(product), 1);
    }
  }

  updateSelected(checked: boolean) {
    if(checked) {
      this.allChecked = true;
      this.removeProductList=this.productList.slice();
    } else {
      this.allChecked=false;
      this.removeProductList=[];
    }
  }

  removeSelectedProducts() {
    let dialogRef = this.dialog.open(DialogResultExampleDialog);
    dialogRef.afterClosed().subscribe(
      result => {
        console.log(result);
        if(result=="yes") {
          for (let product of this.removeProductList) {
            this.removeProductService.sendProduct(product.id).subscribe(
              res => {

              }, 
              err => {
              });
          }
          location.reload();
        }
      }
      ); 
  }

  getProductList() {
    this.getProductListService.sendProduct().subscribe(
      res => {
        console.log(res.json());
        this.productList=res.json();
      }, 
      error => {
        console.log(error)
      }
    );
  }

  ngOnInit() {
  	this.getProductList();
  }

}

@Component({
  selector: 'dialog-result-example-dialog',
  templateUrl: './dialog-result-example-dialog.html'
})
export class DialogResultExampleDialog {
  constructor(public dialogRef: MatDialogRef<DialogResultExampleDialog>) {}
}