package org.example.repository

import org.example.model.Cliente
import java.io.BufferedReader
import java.io.BufferedWriter
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.notExists

class ClienteRepository(private val rutaFichero: Path) {

    fun addTlfn(name: String, tlfn: String): Cliente? {

        if (Files.notExists(rutaFichero)){
            Files.createDirectories(rutaFichero.parent)
            Files.createFile(rutaFichero)
        }

        val br: BufferedReader = Files.newBufferedReader(rutaFichero)
        var existe = false
        br.use {
            it.forEachLine {
                line ->
                val lineaSpliteada = line.split(";")
                if (lineaSpliteada[1] == tlfn){
                    existe = true
                }
            }
        }
        if (existe){
            return null
        }
        else {
            val cliente = Cliente(name, tlfn)
            val bw: BufferedWriter = Files.newBufferedWriter(rutaFichero)
            bw.use { it.append("${cliente.name}, ${cliente.tlfn}\n") }

            return cliente
        }
    }

    fun getTlfn(name: String): String {
        return ""
    }


    fun deleteTlfn(tlfn: String): Boolean{
        return false
    }
}
