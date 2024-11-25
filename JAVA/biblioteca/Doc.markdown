### **Proyecto: Gestión de Biblioteca**

#### **Características Principales**
1. **Gestión de Libros**: CRUD (Crear, Leer, Actualizar, Eliminar) para libros con atributos como título, autor, género, y año de publicación.
2. **Gestión de Autores**: CRUD para autores con datos básicos como nombre, biografía y fecha de nacimiento.
3. **Gestión de Usuarios**: CRUD para usuarios con atributos como nombre, correo, y rol (administrador o lector).
4. **Préstamos**: Sistema para registrar préstamos, devoluciones y calcular fechas límite.
5. **Autenticación y Roles**: Integración de roles (Administrador/Lector) con autenticación JWT.

#### **Tecnologías a Utilizar**
- **Spring Boot**: Para el backend y REST APIs.
- **Hibernate**: Para el mapeo ORM y acceso a la base de datos.
- **MySQL/PostgreSQL**: Base de datos relacional.
- **Spring Security**: Para la autenticación y autorización.
- **Maven**: Para la gestión de dependencias.
- **Lombok**: Para reducir el boilerplate code.

#### **Arquitectura del Proyecto**
Utilizaremos una arquitectura **MVC** (Model-View-Controller) modularizada, con buenas prácticas y organización profesional. La estructura será:

```
biblioteca/
├── src/main/java/com/example/biblioteca
│   ├── controller    # Controladores (APIs)
│   ├── model         # Entidades (Hibernate)
│   ├── repository    # Repositorios (DAO)
│   ├── service       # Lógica de negocio
│   ├── config        # Configuración (seguridad, bases de datos)
│   └── BibliotecaApplication.java # Punto de entrada
├── src/main/resources
│   ├── application.yml # Configuración de Spring Boot
│   └── data.sql        # Datos iniciales para pruebas
└── pom.xml             # Archivo de dependencias Maven
```



### **Project**
- **Elección:** **Maven**
- **Razón:**
  - Maven es más común y ampliamente adoptado en la comunidad Java. 
  - Tiene mejor soporte para dependencias y configuración en comparación con Gradle.
  - Aunque Gradle es más flexible, Maven es ideal para proyectos de aprendizaje y profesionales donde necesitas mayor previsibilidad y facilidad de configuración.

---

### **Spring Boot**
- **Elección:** **3.3.6**
- **Razón:**
  - Es una versión estable (no SNAPSHOT). Las versiones **SNAPSHOT** son versiones de desarrollo y pueden ser menos confiables.
  - La versión **3.3.6** es lo suficientemente reciente como para aprovechar las últimas mejoras y soporte para tecnologías modernas.

---

### **Packaging**
- **Elección:** **Jar**
- **Razón:**
  - Jar (Java Archive) es el estándar para aplicaciones Spring Boot y permite empaquetar todo el proyecto en un único archivo ejecutable.
  - War (Web Application Archive) es necesario solo si necesitas desplegar tu aplicación en un servidor de aplicaciones externo como Apache Tomcat. Como Spring Boot ya incluye un servidor embebido, Jar es la opción preferida.

---

### **Java**
- **Elección:** **Java 17**
- **Razón:**
  - **Java 17** es la última versión LTS (Long-Term Support), lo que significa que tendrá soporte extendido y estabilidad a largo plazo.
  - Aunque Java 21 también es LTS, Java 17 tiene más adopción actualmente, y la mayoría de proyectos profesionales están desarrollados en esta versión.
  - Java 23 es demasiado reciente para proyectos que busquen estabilidad en producción.

---
