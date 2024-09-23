package org.example

import java.io.BufferedReader
import java.io.BufferedWriter
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import kotlin.io.path.notExists


fun main() {
//    val raiz = Path.of("src")
//    println(raiz)
//
//    val rutaFich = raiz.resolve("main").resolve("resources").resolve("carpetaPrueba").resolve("prueba.txt")
//    println(rutaFich)
//
//    val rutaDestino = raiz.resolve("main").resolve("resources").resolve("carpetaPrueba").resolve("pruebaDestino.txt")
//
//    if (rutaDestino.notExists()){
//        Files.createDirectory(rutaDestino.parent)
//
//        Files.createFile(rutaDestino)
//    }
//
//    Files.copy(rutaFich, rutaDestino, StandardCopyOption.REPLACE_EXISTING)
    //___________________________________________________________________________________________________

    // Vamos a explorar cómo leer un archivo con BufferedReader
    // Debemos crear/abrir un flujo de lectura de tipo BufferedReader

//    val ficheroPrueba = Path.of("src/main/resources/prueba.txt")
//    val br: BufferedReader = Files.newBufferedReader(ficheroPrueba)

    // Una vez tenemos el flujo de lectura abierto, podemos consumirlo

//    br.forEachLine { line -> println(line) }
//
//    // Importante cerrar los flujos:    -> forEachLine lo cierra automático
//
//    br.close()

    // Una manera segura de recorrer todas las líneas es usando el .use (abre y cierra el flujo)

//    br.use { flujo -> flujo.forEachLine { println(it) } }
//
//
//    val ficheroPrueba2 = Path.of("src/main/resources/prueba2.txt")
//    val bw: BufferedWriter = Files.newBufferedWriter(ficheroPrueba2)
//
//    bw.use { flujo ->
//        flujo.write("Whinxinglin fron whan tan!11!1uno!!")
//        flujo.write("Whinxinglin fron whan tan!11!1uno!!1")
//        flujo.write("Whinxinglin fron whan tan!11!1uno!!3")
//        flujo.write("Whinxinglin fron whan tan!11!1uno!!2")}
//

    //Escribir un programa para gestionar un listín telefónico
    //con los nombres y los teléfonos de los clientes de una empresa
    //El programa incorporará las funciones crear el fichero con el listín si no existe,
    //para consultar el teléfono de un cliente,
    //añadir el teléfono de un nuevo cliente y eliminar el teléfono de un cliente.
    //
    //El listín debe estar guardado en el fichero de texto listín.txt
    //donde el nombre del cliente y su teléfono deben aparecer separados
    //por comas y cada cliente en una línea distinta.

    val root = Path.of("src")
    val rutaFich = root.resolve("main").resolve("resources").resolve("listin")

    val rutaDestino = root.resolve("main").resolve("resources").resolve("listin")


}