# IdeaSpark 🎉

IdeaSpark is a simple Android app built with **Jetpack Compose** that suggests random activities using the [Bored API](https://www.boredapi.com/).


## 🔀 Branches
- **main** → uses **Retrofit** for networking  
- **ktor-version** → uses **Ktor Client** for networking  

The goal is to compare two different networking approaches in the same project.


## ⚖️ Retrofit vs Ktor

| Aspect            | Retrofit ✅                         | Ktor ✅                           |
|-------------------|-------------------------------------|-----------------------------------|
| **Ease of use**   | Very easy, mature, stable           | Requires more setup, flexible     |
| **Community**     | Large, widely used, lots of docs    | Smaller, newer, growing fast      |
| **Serialization** | Gson / Moshi integration built-in   | Kotlinx.serialization first-class |
| **Features**      | Best for REST APIs                  | Works for REST, WebSockets, HTTP  |
| **Learning**      | Straightforward for beginners       | Better if you want multiplatform  |
