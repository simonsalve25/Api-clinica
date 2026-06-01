package cl.duoc.Api_clinica.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/triage")
public class clinicaController {
    @Autowired
    private clinicaService service;

    @PostMapping
    public ResponseEntity<clinica>
    registrar(@Valid @RequestBody clinica clinica){

        return ResponseEntity.ok(
                service.registrar(clinica));
    }

    @GetMapping
    public List<clinica> listar(){
        return service.obtenerTodos();
    }

    @GetMapping("/criticos")
    public List<clinica> criticos(){
        return service.obtenerCriticos();
    }
}
