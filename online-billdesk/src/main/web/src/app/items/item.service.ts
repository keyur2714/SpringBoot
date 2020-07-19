import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Item } from './item.model';

@Injectable()
export class ItemService{

    appUrl : string = "/bill-desk/api/items";

    constructor(private http : HttpClient ){}

    getItems():Observable<Item[]>{
        return this.http.get<Item[]>(this.appUrl);
    }

}