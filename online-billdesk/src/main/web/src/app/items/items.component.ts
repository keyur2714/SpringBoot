import { Component, OnInit } from '@angular/core';
import { ItemService } from './item.service';
import { Item } from './item.model';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  items: Item[] = [];

  constructor(private itemService : ItemService) { }

  ngOnInit() {
    this.itemService.getItems().subscribe(
      (data)=>{
        this.items = data;
      }
    )
  }

}
