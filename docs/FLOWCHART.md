# PlaceMate Flowcharts

## Overall System Flow

```text
        User
          │
          ▼
     React Frontend
          │
      HTTP (REST API)
          │
          ▼
Spring Boot Controller
          │
          ▼
     Service Layer
          │
          ▼
   Repository Layer
          │
          ▼
      PostgreSQL
```

---

## User Registration Flow

```text
User
 │
 ▼
Register Form
 │
 ▼
Controller
 │
 ▼
Service
 │
 ├── Validate Input
 ├── Check Existing Email
 ├── Encrypt Password
 │
 ▼
Repository
 │
 ▼
Database
 │
 ▼
Success Response
```

---

## Login Flow

```text
User
 │
 ▼
Login
 │
 ▼
Controller
 │
 ▼
Authenticate
 │
 ▼
JWT Token
 │
 ▼
Return Token
```