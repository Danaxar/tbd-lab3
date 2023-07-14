package com.example.demo.Controllers;

import com.example.demo.Models.Voluntario;
import com.example.demo.Services.VoluntarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {
    private final VoluntarioService voluntarioService;

    public VoluntarioController(VoluntarioService voluntarioService) {
        this.voluntarioService = voluntarioService;
    }

    @GetMapping
    public ResponseEntity<List<Voluntario>> getVoluntarios(){
        return ResponseEntity.ok(voluntarioService.getVoluntarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Voluntario> getVoluntarioById(@PathVariable String id) {
        return ResponseEntity.ok(voluntarioService.getVoluntarioById(id));
    }
    @PostMapping
    public ResponseEntity<Voluntario> createVoluntario(@RequestBody Voluntario voluntario){
        return ResponseEntity.ok(voluntarioService.guardarVoluntario(voluntario));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Voluntario> deleteVoluntario(@PathVariable String id){
        return ResponseEntity.ok(voluntarioService.eliminarVoluntario(id));
    }
    @GetMapping("/promedio-habilidades")
    public ResponseEntity<Double> getPromedioHabilidades(){
        return ResponseEntity.ok(voluntarioService.promedioHabilidades());
    }
    @GetMapping("/all-habilidades")
    public ResponseEntity<Integer> getAllHabilidades(){
        Integer habilidades = voluntarioService.getAllHabilidades();
        if(habilidades == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(habilidades);
    }
}
