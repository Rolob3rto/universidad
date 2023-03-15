package com.roberto.universidad.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.roberto.universidad.model.Asignatura;
import com.roberto.universidad.services.AsignaturaServices;


@Controller
@RequestMapping("/asignaturas")
public class AsignaturaController {
    
    @Autowired
    AsignaturaServices asignaturaService;

    @GetMapping(value = "/list")
    public ModelAndView listPage(Model model) {

        List<Asignatura> asignaturas = asignaturaService.findAll();

        ModelAndView modelAndView = new ModelAndView("asignaturas/list");
        modelAndView.addObject("asignaturas", asignaturas);
        return modelAndView;
    }

    @GetMapping(path = { "/edit/{codigo}" })
    public ModelAndView edit(
            @PathVariable(name = "codigo", required = true) String codigo) {

        Asignatura asignatura = asignaturaService.findById(codigo);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("asignatura", asignatura);
        modelAndView.setViewName("asignaturas/edit");
        return modelAndView;
    }

    @GetMapping(path = { "/create" })
    public ModelAndView create(Asignatura asignatura) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("asignatura", new Asignatura());
        modelAndView.setViewName("asignaturas/new");
        return modelAndView;
    }

    @PostMapping(path = { "/save" })
    public ModelAndView save(Asignatura asignatura) {

        Asignatura save = asignaturaService.save(asignatura);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:edit/" + save.getIdAsignatura());
        return modelAndView;
    }

    @PostMapping(path = { "/update" })
    public ModelAndView update(Asignatura asignatura) {

        asignaturaService.update(asignatura);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:edit/" + asignatura.getIdAsignatura());
        return modelAndView;
    }

    @GetMapping(path = { "/delete/{codigo}" })
    public ModelAndView delete(
            @PathVariable(name = "codigo", required = true) String id) {

        asignaturaService.deleteById(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:../list");
        return modelAndView;
    }
}
