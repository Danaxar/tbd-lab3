package com.example.demo.Services;

import com.example.demo.Models.Habilidad;
import com.example.demo.Models.Voluntario;
import com.example.demo.Repository.VoluntarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoluntarioService {
    private final VoluntarioRepository voluntarioRepository;

        public VoluntarioService(VoluntarioRepository voluntarioRepository) {
            this.voluntarioRepository = voluntarioRepository;
        }

    public List<Voluntario> getVoluntarios(){
        return voluntarioRepository.findAll();
    }
    public Voluntario getVoluntarioById(String id){
        return voluntarioRepository.findById(id).orElse(null);
    }
    public Voluntario guardarVoluntario(Voluntario voluntario) {
        return voluntarioRepository.save(voluntario);
    }
    public Voluntario eliminarVoluntario(String id) {
        Voluntario voluntario = getVoluntarioById(id);
        voluntarioRepository.deleteById(id);
        return voluntario;
    }
    public double promedioHabilidades(){
        List<Voluntario> voluntarios = voluntarioRepository.findAll();
        int totalHabilidades = 0;
        int totalVoluntarios = voluntarios.size();
        // Opcion 1, agregando todas las habilidades de todos los voluntarios, asi se repitan
        for(Voluntario voluntario : voluntarios){
            totalHabilidades += voluntario.getHabilidades().size();
        }

        return totalHabilidades / (double) totalVoluntarios;

        /*
        // Opcion 2, sin repetir habilidades ya agregadas
        List<Habilidad> habilidades = new ArrayList<>();
        for(Voluntario voluntario : voluntarios){
            for(Habilidad habilidad : voluntario.getHabilidades()){
                if(!habilidades.contains(habilidad)){
                    habilidades.add(habilidad);
                }
            }
        }
        return habilidades.size() / (double) totalVoluntarios;
         */
    }
    public Integer getAllHabilidades() {
        List<Voluntario> voluntarios = voluntarioRepository.findAll();
        List<Habilidad> habilidades = new ArrayList<>();
        for (Voluntario voluntario : voluntarios) {
            for (Habilidad habilidad : voluntario.getHabilidades()) {
                if (!habilidades.contains(habilidad)) {
                    habilidades.add(habilidad);
                }
            }
        }
        return habilidades.size();
    }


}

