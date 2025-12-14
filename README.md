# RealMadrid App ⚽👑

Aplicación Android desarrollada en Kotlin que muestra información interactiva sobre la plantilla actual del Real Madrid. Este proyecto demuestra el uso de listas avanzadas (`RecyclerView`), navegación con `Fragments` y manejo de imágenes externas.

## 📱 Características

*   **Listado de Jugadores**: Visualización de la plantilla mediante un `RecyclerView` optimizado. Cada elemento es una tarjeta (`CardView`) que muestra la foto, nombre, número y posición.
*   **Detalle del Jugador**: Navegación a una pantalla de detalle (`Fragment`) al pulsar sobre cualquier jugador, mostrando información ampliada y una descripción personalizada.
*   **Gestión de Imágenes**: Carga asíncrona de imágenes desde URLs remotas utilizando la librería **Glide**.
*   **Interacción (Gestos)**: Implementación de *Swipe-to-Delete* (deslizar para borrar) utilizando `ItemTouchHelper`, permitiendo eliminar jugadores de la lista.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje**: [Kotlin](https://kotlinlang.org/)
*   **Arquitectura UI**:
    *   XML Layouts
    *   `ConstraintLayout` para diseños responsivos.
    *   `CardView` para los elementos de la lista.
    *   `ViewBinding` para una interacción segura con las vistas.
*   **Componentes Android**:
    *   `RecyclerView` & `Adapter` pattern.
    *   `Fragment` & `FragmentManager` para la navegación.
    *   `Activity`
*   **Librerías de Terceros**:
    *   [Glide](https://github.com/bumptech/glide) (v4.16.0): Para la carga, caché y transformación de imágenes.

## 📂 Estructura del Proyecto

El código fuente principal se encuentra en el paquete `com.example.realmadrid`.

*   **Datos**:
    *   `Jugadores.kt`: Data class que define el modelo de un jugador.
    *   `JugadoresProvider.kt`: Objeto Singleton que provee la lista inicial de datos (Mock Data).
*   **Vistas y Adaptadores**:
    *   `MainActivity.kt`: Contenedor principal y configuración del RecyclerView.
    *   `RealMadridAdapter.kt`: Adaptador que vincula los datos con la vista.
    *   `RealMadridViewHolder.kt`: Clase que gestiona las vistas de cada celda.
    *   `JugadorDetailFragment.kt`: Lógica de la pantalla de detalle.
*   **Recursos**:
    *   `item_realmadrid.xml`: Diseño de cada fila de la lista.
    *   `fragment_jugador_detail.xml`: Diseño de la pantalla de detalle.

## 🚀 Instalación y Ejecución

1.  **Clonar/Descargar** el proyecto en tu equipo local.
2.  Abrir el proyecto en **Android Studio**.
3.  Esperar a que **Gradle** sincronice todas las dependencias.
4.  Ejecutar la aplicación (`Run 'app'`) en un emulador Android o dispositivo físico conectado.
    *   *Nota: Se requiere conexión a internet para cargar las imágenes de los jugadores.*

## 📸 Capturas de Pantalla



| ![](C:\Users\pedro\Pictures\Saved Pictures\Screenshot_1portad.png) | ![rmScreenshot_2](C:\Users\pedro\Pictures\Saved Pictures\rmScreenshot_2.png) |
| ------------------------------------------------------------ | ------------------------------------------------------------ |



---
Desarrollado como práctica de la asignatura **PMDM** (Programación Multimedia y Dispositivos Móviles).
