# DiyosInfoTech_Security_Application
 This is Sample Security Application using JWT Token

 Step 1
 register User: http://localhost:8080/auth/signup
{
  "email": "diyosinfotech@gmail.com",
  "password": "1234",
  "fullName":"diyosinfotech"
}
 
 Step 2
 Login User : http://localhost:8080/auth/login
{
  "email": "diyosinfotech@gmail.com",
  "password": "1234"
}

Step 3
Use The Token From responce From step 2 To Access any API End Point

Step 4
Send Employee Data : http://localhost:8080/employees/saveEmployee

{
  "name": "Employee Name",
  "email": "employee@gmail.com",
  "department": "IT"
}

Step 5
Get Employee Data by Id : http://localhost:8080/employees/1
Get All Employee Data : http://localhost:8080/employees/all

Step 6
Update Employee Data by Id http://localhost:8080/employees/1

Step 7
Delete Employee Data by Id http://localhost:8080/employees/2
