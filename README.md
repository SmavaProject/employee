To start the application:
1) start the DB: java -cp h2-1.4.190.jar org.h2.tools.Server
2) make sure that DB path is right - jdbc:h2:tcp://localhost/~/IdeaProjects/employee/data
credentials : root 
3) build with maven in ide and start with ide the backend
4) go to /angular7-springboot-client and run npm start to run frontend
4) open app at http://localhost:4200/api/emp/employees
6) check api only: http://localhost:8080//api/v1/employees




***
You may need to modify packange.json:
"start": "ng serve --proxy-config proxy.conf.json",

tutorial used for the app:

https://www.javaguides.net/2019/02/spring-boot-2-angular-7-crud-example-tutorial.html
https://www.javaguides.net/2019/06/spring-boot-angular-8-crud-part-1-develop-springboot-crud-rest-apis.html

https://medium.com/bb-tutorials-and-thoughts/how-to-develop-and-build-angular-app-with-java-backend-87fb603c6e17
