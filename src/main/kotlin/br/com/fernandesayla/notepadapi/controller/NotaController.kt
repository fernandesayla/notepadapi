package br.com.fernandesayla.notepadapi.controller

import br.com.fernandesayla.notepadapi.model.Nota
import br.com.fernandesayla.notepadapi.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin
@RequestMapping("/nota")
class NotaController {

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping
    internal fun buscarTodas(): List<Nota> {
        return notaService.buscarTodas()
    }

    @GetMapping("/titulo/{titulo}")
    internal fun buscar(@PathVariable("titulo") titulo : String): Nota {
        return notaService.buscar(titulo)
    }

    @PostMapping
    fun salvar(@RequestBody nota: Nota) {
        notaService.salvar(nota)
    }
}