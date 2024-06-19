package cemece.cie11.cie11.controller;

import java.util.Optional;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cemece.cie11.cie11.entity.Defuncion;
import cemece.cie11.cie11.repository.AccionesRepository;


// Componente: Las piezas o capas del código (Controller, Repository, Service, Mapper, etc...)

// Bean: Las instancias de los componentes que van a ser reutilizables en todo el proyecto.

// La inversión de control (IoC) de Spring crea los BEANs a partir de los Componentes encontrados en el código.




@Controller
@RequestMapping("admin") // -> Le da un prefijo a todos las rutas de /admin
public class AdminController {

    @Autowired // -> Inyección de Dependencias
    private AccionesRepository repository; // <--- Instancia = BEAN


    @GetMapping // -> /admin
    public String index(Model model){

        model.addAttribute("defuncion", repository.findAll());

        return "admin/index.html";
    }

    @GetMapping("create") // -> /admin/formulario
    public String create(Model model) {
        model.addAttribute("defuncion", new Defuncion());
        return "admin/create.html";
    }


    @GetMapping("editar/{id}")
    public String edit(@PathVariable("id") int id, Model model) {

        Optional<Defuncion> defuncion = repository.findById(id);

        if (defuncion.isPresent()) {
            model.addAttribute("defuncion", defuncion.get());

            return "/admin/editar.html";
        }

        return "redirect:/admin";
    }



    @PostMapping("guardar")
    public String save(@ModelAttribute("defuncion") Defuncion data){
        repository.save(data);
        return "redirect:/admin";

    }


     @PostMapping("eliminar/{id}")
        public String delete(@PathVariable("id") int id) {

            repository.deleteById(id);

            return "redirect:/admin";
        }



}