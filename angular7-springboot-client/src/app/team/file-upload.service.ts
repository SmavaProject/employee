import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class FileUploadService {

  constructor(private httpClient: HttpClient) { }
/*
  postFile(fileToUpload: File): Observable<boolean> {
    const endpoint = 'your-destination-url';
    const formData: FormData = new FormData();
    formData.append('fileKey', fileToUpload, fileToUpload.name);
    return this.httpClient
      .post(endpoint, formData, { headers: new HttpHeaders() })
      .map(() => { return true; })
      .catch((e) => this.handleError(e));
  }
*/
  postFile(fileToUpload: File): Observable<boolean> {return new Observable<boolean>()}

  private handleError(e: any) {
    console.log(e);
    return undefined;
  }
}
