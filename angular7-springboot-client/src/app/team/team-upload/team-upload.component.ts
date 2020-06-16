import { Component, OnInit } from '@angular/core';
import {FileUploadService} from "../file-upload.service";

@Component({
  selector: 'app-team-upload',
  templateUrl: './team-upload.component.html',
  styleUrls: ['./team-upload.component.css']
})
export class TeamUploadComponent implements OnInit {

  fileToUpload: File = null;

  constructor(private fileUploadService: FileUploadService) { }

  ngOnInit(): void {
  }

  handleFileInput(files: FileList) {
    this.fileToUpload = files.item(0);
  }

  uploadFileToActivity() {
    this.fileUploadService.postFile(this.fileToUpload).subscribe(data => {
      // do something, if upload success
      console.log("file is uploaded");
    }, error => {
      console.log(error);
    });
  }
}
