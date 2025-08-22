EndPoints:
Start Service B (Provider) → runs on 8081.
Endpoints:

GET http://localhost:8081/provider/greet/John
GET http://localhost:8081/provider/add?a=5&b=7
GET http://localhost:8081/provider/status

Start Service A (Consumer) → runs on 8080.
It calls Service B’s endpoints internally:
GET http://localhost:8080/consumer/greet/John
GET http://localhost:8080/consumer/add?a=5&b=7
GET http://localhost:8080/consumer/status
