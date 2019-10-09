![ss_ad101c399356944164afaa4b6827d564619e7928 1920x1080 (1)](https://user-images.githubusercontent.com/47396707/66511795-eefdf600-ead7-11e9-9425-08dc351a14bf.jpg)

# Age-Of-Empires-III-RESTful-Web-Service
Web Service which contains a few endpoints to send HTTP requests. There are data like: ages, civilizations, types and units. 
In response you will receive data in JSON format. All endpoints are described below. 

## Endpoints
### Age
* `(GET) /api/v1/aoe/ages` - get all ages - Age must be active (not deleted)
* `(GET) /api/v1/aoe/ages/age/{id}` - get age by id - Age must be active (not deleted)
* `(POST) /api/v1/aoe/age` - add new age
* `(PUT) /api/v1/aoe/age{id}` - edit or add new age
* `(DELETE) /api/v1/aoe/age/{id}` - delete age - Soft delete. Age is not deleted from database. Age status is changed to not active. When age is not active, unit is not active too

### Civilization
* `(GET) /api/v1/aoe/civilizations` - get all civilizations - Civilization must be active (not deleted)
* `(GET) /api/v1/aoe/civilizations/civilization/{id}` - get civilization by id - Civilization must be active (not deleted)
* `(POST) /api/v1/aoe/civilizations/civilization` - add new civilization
* `(PUT) /api/v1/aoe/civilizations/civilization/{id}`- edit or add new civilization
* `(DELETE) /api/v1/aoe/civilizations/civilization/{id}` - delete civilization. Soft delete. Civilization is not deleted from database. Civilization status is changed to not active. When civilization is not active, unit is not active too  

### Unit 
* `(GET) /api/v1/aoe/units` - get all active units - Unit must be active (not deleted)
* `(GET) /api/v1/aoe/units/unit/{id}` - get unit by id - Unit must be active (not deleted)
* `(POST) /api/v1/aoe/units/unit` - add new unit
* `(PUT) /api/v1/aoe/units/unit/{id}` - edit or add new unit
* `(DELETE) /api/v1/aoe/units/unit/{id}` - delete unit. Soft delete. Unit is not deleted from database. Unit status is changed to not active

### Type
* `(GET) /api/v1/aoe/types` - get all types - Type must be active (not deleted)
* `(GET) /api/v1/aoe/types/type/{id}`- get type by id - Type must be active (not deleted)
* `(POST) /api/v1/aoe/types/type` - add new type
* `(PUT) /api/v1/aoe/types/type/{id}`- edit or add new type
* `(DELETE) /api/v1/aoe/types/type/{id}` - delete type. Type is not deleted from database. Type status is changed to not active. When type status is not active, unit is not active too

In POST, PUT requests it is necessary to send data in JSON format. All received data are validated. 

## Technologies
- Java
- REST
- Spring
- Spring Boot
- Spring Security
- Hibernate
- MySQL
- Tomcat
- Lombok
- Postman

## Database structure
![aaaa](https://user-images.githubusercontent.com/47396707/66516764-1a85de00-eae2-11e9-9cd3-df101de28512.png)






