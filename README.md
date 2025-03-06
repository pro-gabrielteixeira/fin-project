# 📊 Bitcoin Indicators App

Fullstack project composed of:

✅ **Backend:** REST API developed using **Java + Spring Boot**, focused on retrieving and interpreting key indicators for the Bitcoin market, such as current price, MVRV, Fear and Greed Index, and Mayer Multiple.  
✅ **Frontend:** **Angular** application to consume the API and display data in a user-friendly way.

---

## 📌 Objective

Centralize data from various sources about Bitcoin, process this information, and provide a **clear and objective interpretation** for each indicator, displayed visually and interpretatively in the Angular frontend.

Ideal for investors and enthusiasts looking for **quick and reliable insights**.

---

## 💻 Backend - Bitcoin Indicators API

### 🛠️ Technologies Used

- **Language:** Java 17+
- **Framework:** Spring Boot 3
- **External API Consumption:** RestTemplate or WebClient
- **Documentation:** Springdoc OpenAPI (Swagger)
- **Logs:** Logback
- **Testing:** JUnit 5 + Mockito
- **Dependency Management:** Maven

---

### 📈 Features

✅ Fetch current Bitcoin price  
✅ Retrieve relevant indicators (MVRV, Fear and Greed Index, Mayer Multiple)  
✅ Normalize and process data from multiple sources  
✅ Interpret and explain each indicator in a simplified way  
✅ Expose data via REST endpoints  
✅ Automatic documentation with Swagger (OpenAPI)

---

### 📊 Example API Response

```json
{
    "bitcoinPrice": 63000,
    "mvrv": {
        "value": 2.8,
        "interpretation": "Neutral - Bitcoin is close to its fair value"
    },
    "fearAndGreedIndex": {
        "value": 72,
        "interpretation": "Greed - Optimistic market, possible sign of speculative bubble"
    },
    "mayerMultiple": {
        "value": 2.2,
        "interpretation": "Above historical average - Bitcoin may be overvalued"
    }
}
```

## 🔗 Planned Endpoints

| Method | Endpoint               | Description                        |
|---|---|---|
| GET   | `/` | Returns Bitcoin data and analysis |

---

## 🌐 Frontend - Bitcoin Indicators Dashboard

### 🛠️ Technologies Used

- Angular 17+
- Typescript
- Bootstrap or Angular Material (optional)
- API consumption via HttpClient
- Charts with Chart.js (or another library)
- Deployment via GitHub Pages (or another free platform)

---

### 📋 Features

✅ Main screen showing a summary of indicators  
✅ Button to refresh data in real-time  
✅ Display indicators in cards or charts  
✅ Easy-to-understand interpretation for each metric  

---

### 🗺️ Full Application Flow

1️⃣ Frontend makes a request to the backend (GET `/indicators/bitcoin`).  
2️⃣ Backend fetches data from external sources (CoinGecko, Alternative.me, etc.).  
3️⃣ Backend processes, interprets, and responds with consolidated JSON.  
4️⃣ Frontend displays data in cards, charts, and/or tables, with friendly interpretations.  

---

### ✨ Key Differentials

✅ Centralized data in a single API  
✅ Simplified interpretation to support quick decision-making  
✅ Ideal for dashboards, alerts, or notifications  

