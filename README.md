# 📖 Dictionary App – Jetpack Compose + Retrofit

## 📌 Introduction

This is a modern Android Dictionary Application built using **Jetpack Compose** and **Material 3**.

The app allows users to search for a word and fetch its meaning, definitions, and related information using a Dictionary API.

The project follows **MVVM architecture** and uses **Retrofit** for network communication, ensuring clean code structure and scalable design.

---

## 🚀 Features

- 🔎 Search any word
- 🌐 Fetch data from Dictionary API
- 📖 Display word meanings and definitions
- 🧠 MVVM Architecture implementation
- 🔄 Network requests using Retrofit
- 🎨 Modern UI with Material 3
- 📱 Fully built using Jetpack Compose

---

## 📸 Screenshots

<p align="center">
  <img src="images/WhatsApp Image 2026-02-11 at 1.39.15 PM.jpeg" width="300"/>
  <img src="images/WhatsApp Video 2026-02-11 at 1.39.15 PM.gif" width="300"/>
</p>

---

## 🧠 How It Works

1. User enters a word in the search field.
2. User clicks the search button.
3. The app makes an API request using Retrofit.
4. JSON response is received.
5. Data is mapped to Kotlin data classes.
6. The ViewModel updates the UI state.
7. The results are displayed using Compose components.

---

## 🏗️ Architecture

This project follows **MVVM (Model-View-ViewModel)** architecture:

- **Model** → Data classes representing API response
- **View** → Jetpack Compose UI
- **ViewModel** → Handles business logic and state
- **Repository Layer** → Handles API calls using Retrofit

Benefits:

- Clear separation of concerns  
- Scalable structure  
- Easy maintenance  
- Improved testability  

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **Retrofit**
- **REST API Integration**
- **MVVM Architecture**

---

## 🔧 API Integration

- Retrofit is used for making HTTP requests.
- JSON responses are parsed into Kotlin data classes.
- API errors and responses are handled through ViewModel state.

---

## 🎯 Project Purpose

This project was built to:

- Practice API integration using Retrofit
- Implement MVVM in a real-world application
- Strengthen state management in Jetpack Compose
- Build a functional and scalable dictionary application

---

## 👨‍💻 Author

Developed as part of Android development practice using modern Android architecture and networking principles.
