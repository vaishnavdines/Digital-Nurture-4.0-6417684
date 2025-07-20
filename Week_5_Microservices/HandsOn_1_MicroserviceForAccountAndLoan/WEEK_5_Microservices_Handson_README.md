
# 🏦 Bank Microservices - Spring Boot Hands-On (Week 5)

This hands-on guide helps you build two independent Spring Boot microservices — **Account** and **Loan** — using Maven and dummy responses. It includes both **input steps** and **expected outputs** in one place.

---

## 📁 Folder Structure

```
WEEK_5_Microservices/
└── Handson/
    ├── account/
    ├── loan/
    └── README.md
```

---

## ✅ Account Microservice

### 🛠️ Input Steps

1. Go to [https://start.spring.io](https://start.spring.io)
2. Fill details:
   - Group: `com.cognizant`
   - Artifact: `account`
   - Dependencies: Spring Web, Spring Boot DevTools
3. Generate and extract the project to `WEEK_5_Microservices/Handson/account`.
4. Run `mvn clean package` in the account folder.
5. Open project in Eclipse and add the controller:

```java
package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccountDetails(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "savings",
            "balance", 234343
        );
    }
}
```

6. Run the service using `AccountApplication.java`.

### 📤 Output

URL to test:  
```
GET http://localhost:8080/accounts/00987987973432
```

Expected JSON Response:
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

---

## ✅ Loan Microservice

### 🛠️ Input Steps

1. Go to [https://start.spring.io](https://start.spring.io)
2. Fill details:
   - Group: `com.cognizant`
   - Artifact: `loan`
   - Dependencies: Spring Web, Spring Boot DevTools
3. Extract project to `WEEK_5_Microservices/Handson/loan`
4. In `application.properties`, add:
```properties
server.port=8081
```
5. Add controller class:

```java
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "car",
            "loan", 400000,
            "emi", 3258,
            "tenure", 18
        );
    }
}
```

6. Run the service using `LoanApplication.java`.

### 📤 Output

URL to test:  
```
GET http://localhost:8081/loans/H00987987972342
```

Expected JSON Response:
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

## 🧠 Notes

- Use console monitor in Eclipse to toggle between microservices.
- If both use port 8080, second one will fail. Change loan to 8081.
- Test with Postman or browser for quick results.

---

## 🗂️ GitHub Repo Structure (Suggested)

```
BankMicroservices/
├── account/
│   ├── src/
│   ├── pom.xml
│   └── README.md
└── loan/
    ├── src/
    ├── pom.xml
    └── README.md
```

---

Created for **Cognizant Microservices Training - Week 5**
