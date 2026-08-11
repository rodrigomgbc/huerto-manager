### Archivo .md proyecto "gestor-huerto"
Ideado para la gestión de un huerto para pequeños agricultores, principalmente para aficionados.

## Tecnologías usadas
 JavaFX, Maven, Java 21 y SQLite.

## Caracteristicas:
- Control de plantas
- Inventario de materiales
- Nivel del agua del depósito
- Registro de cosechas 

## Propósitos de Mi Huerto Manager

1. **Visualización**: Mapa/vista del huerto con surcos y plantas
2. **Inventario**: Gestión de materiales (stock)
3. **Control**: Plantas, agua (depósito), cosechas
4. **Interfaz**: Amigable con temática agrícola

### Proximas funcionalidades...

## 10/08/2026
Lo primero que he hecho hoy ha sido crear el proyecto, luego lo he vinculado con
github y ahora estoy con el .pom

## pom.xml - Configuración Completada

###  Properties (Configuración Base)
- Java 21
- JavaFX 21.0.2
- Encoding UTF-8

###  Dependencies (Librerías)
- **JavaFX Controls**: Componentes de interfaz gráfica
- **JavaFX FXML**: Para archivos de diseño XML
- **SQLite JDBC**: Driver para la base de datos local

###  Plugins (Herramientas)
1. **Maven Compiler Plugin**: Compila el código Java
2. **JavaFX Maven Plugin**: Ejecuta la app con `mvn javafx:run`
3. **Maven Shade Plugin**: Empaqueta todo en `.jar` ejecutable

### Comandos útiles:
```bash
mvn clean compile      # Compila el proyecto
mvn javafx:run        # Ejecuta la aplicación
mvn package           # Crea un .jar ejecutable
```

##  TODO - Desarrollo Huerto Manager

###  Configuración Completado
- [x] Proyecto Maven creado
- [x] pom.xml con dependencias
- [x] .gitignore y README.md
- [x] Git inicializado

### En Progreso
- [ ] Estrctura de carpetas (Estructura de la aplicación)
- [ ] Estrctura de clases (Estructura de la aplicación)
  - [x] Huerto
  - [ ] Surco
  - [ ] Planta
  - [ ] Material
  - [ ] Deposito
  - [ ] Cosecha
- [ ] Base de datos

### Posterior
- [ ] Lógica de la aplicación
- [ ] Interfaz gráfica
