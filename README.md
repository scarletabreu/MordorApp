# Mordor Student App

## Descripción

**Mordor Student App** es una aplicación Android desarrollada como **tarea de la asignatura de Desarrollo Móvil**. La app implementa un sistema de registro y gestión de perfiles de estudiantes con una temática inspirada en *El Señor de los Anillos*.

### Objetivo de la tarea

Desarrollar una aplicación móvil que demuestre el conocimiento de:
- Navegación entre fragmentos
- Actividades y transición entre pantallas
- View Binding en Android
- Diseño de interfaces con ConstraintLayout
- Validación de formularios
- Manejo de Intent y paso de datos entre actividades

---

## Características principales

### Funcionalidades implementadas

1. **Pantalla principal con Navigation Components**
   - Dos fragmentos navegables: FirstFragment y SecondFragment
   - Toolbar personalizado con tema Mordor

2. **Sistema de registro de estudiantes**
   - Formulario de perfil con campos:
     - Nombre del siervo (estudiante)
     - Código de séquito (matrícula)
     - Raza/Disciplina (carrera)
   - Validación de campos obligatorios
   - Spinner personalizado con carreras disponibles

3. **Pantalla de resumen**
   - Visualización de datos registrados
   - Botón para editar el perfil
   - Mensaje de bienvenida personalizado

4. **Interfaz temática**
   - Colores Mordor (oscuro, dorado, rojo)
   - El Ojo de Sauron como FAB (Floating Action Button)
   - Textos y strings temáticos

---

## Tecnologías y librerías

- **Android API**: Nivel 24 (Android 7.0) - Nivel 36 (Android 15)
- **Lenguaje**: Java
- **Arquitectura**: MVVM (parcialmente con View Binding)
- **Librerías principales**:
  - `androidx.navigation` - Navigation Component
  - `androidx.fragment` - Fragment support
  - `com.google.android.material` - Material Design 3
  - `androidx.constraintlayout` - ConstraintLayout
  - `androidx.viewbinding` - View Binding

---

## Estructura del proyecto

```
app/
├── src/main/
│   ├── java/com/example/mordor/
│   │   ├── MainActivity.java          # Actividad principal
│   │   ├── FirstFragment.java         # Primer fragmento
│   │   ├── SecondFragment.java        # Segundo fragmento
│   │   ├── ProfileView.java           # Actividad de edición de perfil
│   │   └── ResumenView.java           # Actividad de resumen de datos
│   │
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml      # Layout principal con FAB
│   │   │   ├── content_main.xml       # Contenedor de fragmentos
│   │   │   ├── fragment_first.xml     # Layout FirstFragment
│   │   │   ├── fragment_second.xml    # Layout SecondFragment
│   │   │   ├── activity_profile_view.xml  # Layout ProfileView
│   │   │   └── activity_resumen_view.xml  # Layout ResumenView
│   │   │
│   │   ├── values/
│   │   │   ├── colors.xml             # Paleta de colores Mordor
│   │   │   ├── strings.xml            # Strings temáticos
│   │   │   └── themes.xml             # Tema de la app
│   │   │
│   │   └── navigation/
│   │       └── nav_graph.xml          # Gráfico de navegación
│   │
│   └── AndroidManifest.xml            # Declaración de actividades
│
└── build.gradle                        # Dependencias del proyecto
```

---

## Cómo ejecutar la app

### Requisitos previos
- Android Studio (versión reciente)
- Android SDK 24 o superior
- JDK 11+

### Pasos de instalación

1. **Clona o descarga el proyecto**
```bash
git clone https://github.com/tuusuario/mordor-student-app.git
cd mordor-student-app
```

2. **Abre en Android Studio**
   - File → Open → Selecciona la carpeta del proyecto

3. **Sincroniza Gradle**
   - Android Studio detectará las dependencias automáticamente
   - Click en "Sync Now"

4. **Ejecuta la app**
   - Click en "Run" o presiona `Shift + F10`
   - Selecciona un emulador o dispositivo físico

---

## Flujo de navegación

```
MainActivity (con FAB temático)
    ↓
FirstFragment (botón "Siguiente")
    ↓
ProfileView (formulario de registro)
    ↓
ResumenView (resumen de datos)
    ↓
(Click "Reescribir" → vuelve a ProfileView)
```

**También hay:**
- FirstFragment → SecondFragment (navegación con fragmentos)
- FAB "El Ojo" → Toast temático (decorativo)

---

## Tema Mordor

### Paleta de colores
| Color | Código | Uso |
|-------|--------|-----|
| Mordor Dark | `#121212` | Fondo principal |
| Mordor Surface | `#1E1E1E` | Superficies secundarias |
| One Ring Gold | `#FFD700` | Textos principales y acentos |
| Eye Red | `#CF6679` | FAB (El Ojo de Sauron) |
| White | `#FFFFFF` | Textos secundarios |

### Strings temáticos
- "Tierra Media" → Welcome
- "Siervo" → Estudiante
- "Código de Séquito" → Matrícula
- "Raza/Disciplina" → Carrera
- "Forjar" → Guardar
- "Reescribir" → Editar
- "El Ojo de Sauron" → Visión del Señor

---

## Validaciones implementadas

### En ProfileView:
- Nombre no puede estar vacío
- Matrícula no puede estar vacía
- Carrera debe ser seleccionada (no "Selecciona tu sendero")
- Mensajes de error personalizados temáticos

---

## Conceptos Android aplicados

| Concepto | Ubicación | Propósito |
|----------|-----------|----------|
| **Navigation Component** | nav_graph.xml, FirstFragment.java | Navegar entre fragmentos |
| **View Binding** | Todos los .java | Acceso seguro a vistas |
| **Intent** | MainActivity.java, ProfileView.java | Transición entre actividades |
| **Bundle/Extra** | ProfileView.java → ResumenView.java | Pasar datos entre actividades |
| **Spinner** | ProfileView.java | Selección de carrera |
| **ArrayAdapter** | ProfileView.java | Población de Spinner |
| **ConstraintLayout** | Todos los .xml | Diseño responsive |
| **Material Components** | AppBarLayout, FAB, Button | UI moderna |

---

## Autor

Scarlet - Estudiante de Desarrollo Móvil

**Asignatura**: Desarrollo de Aplicaciones Móviles  
**Año**: 2026

---

## Notas de la tarea

- [x] Navegación entre fragmentos funcionando
- [x] Transición entre actividades sin crashes
- [x] Validación de formularios implementada
- [x] Tema personalizado Mordor aplicado
- [x] View Binding en todas las actividades y fragmentos
- [x] AndroidManifest.xml completamente declarado

---

## Licencia

Proyecto académico - Desarrollo Móvil 2026

---

**¡Que el Anillo no corra lo mismo que la app!** 🧙‍♂️👁️
