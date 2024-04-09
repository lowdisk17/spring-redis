# spring-redis
A simple project to kickstart your spring boot and redis journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
2. Make sure you have redis installed locally on your environment
3. Make sure the redis instance in your environment is up and running usually redis runs on localhost:6379 by default
5. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     - POST http://localhost:9999/products/save -> JSON data is 
     {
       "id": 1,
       "name": "Pencil",
       "qty": 3,
       "price": 1
     }
     - GET http://localhost:9999/products/getAll
     - GET http://localhost:9999/products/getById/{id}
     - PUT http://localhost:9999/products/delete/{id}
7. Sample Response
   - "Success" for both delete and save endpoints
   - check redis for data persisted from your testing
