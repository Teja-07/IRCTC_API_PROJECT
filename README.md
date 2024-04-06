
---

### IRCTC-API

Hi, I am Teja Chinitha, currently pursuing my final year in computer science at Vellore Institute of Technology. Apart from this project, I have 3 years of exposure in the Java domain and completed 3-4 internships in software engineering and mobile application development. Below are a few of my coding profiles and project links:

- [Leetcode Profile](https://leetcode.com/Teja_07/)
- [GeeksforGeek Profile](https://auth.geeksforgeeks.org/user/chinthateja07)
- [HackerRank Profile](https://www.hackerrank.com/profile/chinthateja07)

#### Project Description:

In this project, we developed an IRCTC API which helps developers add trains and track customer activities such as purchasing tickets or adding trains.

#### Technologies Used:

- **Java and Spring Boot**: The application is developed entirely using Java Spring Boot, enabling admins to add or delete trains faster and achieve a 30% reduction in adding time. It also helps users to purchase tickets faster.
  
- **RestFul Architecture and JSON Data Format**: JSON format is used to add trains from the admin side and handle source and destination keys from the user side. This API seamlessly integrates with adding trains and enables automatic posting of trains for users across the API, enhancing user reach and visibility.
  
- **Postman**: Postman is used to check whether the data hitting is correct or not and helped to complete the API more efficiently.
  
- **MySQL Workbench**: User or admin-provided data is stored in MySQL Workbench in table format. Below are a few screenshots of the database.

#### How to Run IRCTC API:

1. **Clone the Repository**: Clone the project to your local machine using the following command:
   ```
   git clone https://github.com/your-username/IRCTC_API_PROJECT.git
   ```

2. **Navigate to the Directory**: Enter the cloned repository directory:
   ```
   cd IRCTC_API_PROJECT
   ```

3. **Build the Project**: Build the project using Maven or Gradle:
   ```
   Maven clean install
   ```
   or
   ```
   gradle clean build
   ```

4. **Access IRCTC_API_PROJECT**: Once the application is running, access IRCTC_API_PROJECT through your web browser using the following URL:
   ```
   http://localhost:8080
   ```

#### Requirements:

- **User**:
  1. Users can check the availability of trains between two stations. The system provides real-time updates on seat
     availability. Users can book seats if availability is greater than zero:
     ```
     http://localhost:8080/api/users/register
     ```
     ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/617a177a-94a0-49bd-bb6f-5c5eb0b77b8c)

  2. To log in, pass the username and password:
     ```
     http://localhost:8080/api/users/login?username=rahul&password=kohli
     ```
  3. Credentials will be stored in the MySQL database.
    ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/14429c34-587a-4751-8a4d-2176ef4842f3)

  
- **Admin**:
  1. Admins can add new trains, update train details including total seats available, and manage existing trains:
     ```
     http://localhost:8080/api/trains/add
     ```
     ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/c711fe06-55b2-4d16-81ee-7f8f0cc991a3)

  2. To check train availability, pass the source and destination:
     ```
     http://localhost:8080/api/trains/availability?source=rorurkala&destination=basar
     ```
     ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/10543c40-cdaa-45ab-9293-350bd3912c74)
     ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/1a8b86a5-0255-4f69-be5f-3728e25adf50)


- **Booking**:
  1. Both admin and user can check bookings and available trains:
     ```
     http://localhost:8080/api/bookings/book
     ```
     ![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/6ddcf9da-a057-4835-905d-51b95169ccb5)

  2. To get details of a user's booking, use:
     ```
     http://localhost:8080/api/bookings/user/1
     ```
![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/aa72103a-9b0d-4220-92c1-e65c6351c8dc)
![image](https://github.com/Teja-07/IRCTC_API_PROJECT/assets/82213085/0cd100a2-acad-47aa-83cc-08f5db7e97dc)


#### Conclusion:
In conclusion, the railway management system designed using Java Spring Boot and MySQL Workbench effectively 
addresses the requirements of a platform like IRCTC. By leveraging Spring Boot's features for handling HTTP 
requests and MySQL Workbench for data storage, the system ensures reliability, scalability, and real-time 
performance. Additionally, the system incorporates role-based access control to differentiate between Admin 
and Login users, providing a seamless and secure experience for all users.
