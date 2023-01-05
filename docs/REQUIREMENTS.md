# General description
TBD


# Models
- Products
  - Something, that can be sold  
  - Contains(at least) ```id```, ```name```, ```price``` 
- Customers
  - People, who can buy products
  - Contains(at least) ```id```, ```firstName```, ```lastName```, ```amountOfMoney```

# Actors
- Guests
- Customers
- Admins

# Use cases

### Guests
1) Guest can't access functionality of shop, that's why his any request must be forbidden

### Customers
1) Customer can receive information about himself (```GET /me```)
2) Customer can list his own products (```GET /customers/{user-id}/products```)
3) Customer can buy product, providing id of product (TBC mb ```POST /customer/{user-id}/products/{product-id}```)
4) Customer can return bought product (TBD)
   - if two week after buying hasn't expired

### Admins
1) Admin can list all authenticated users (```GET /users```)
2) Admin can list all customers (```GET /customers```)
3) Admin can list all admins (```GET /admins```)
4) Admin can grant admin role, providing e-mail (```POST /admins```) 
5) Admin can revoke admin role by id (```DELETE /admins/{admin-id}```)
   - admin can't revoke himself
6) Admin can edit product (```PUT /products/{product-id}```)
7) Admin can delete product (```DELETE /products/{product-id}```)
8) Admin can add product (```POST /products```)

# Authentication 
1) Any user can be authenticated:
   - providing e-mail and password (```POST /login/basic```)
   - via Google (```POST /login/oauth/google```)
   - via Facebook (```POST /login/oauth/facebook```)

# Testing and deployment
1) Application should contain integration tests(Spring Boot tests) and Postman collection
2) Application should be prepared for running in Docker and deployment(AWS, Azure, etc)
