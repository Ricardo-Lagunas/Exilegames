package Generation.Exilegames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/vj") // This means URL's start with /demo (after Application path)
public class videojuegosController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data

    private videojuegosRepositorio videojuegosRepositorio;


    //curl localhost:8080/vj/add -d nombreVJ=Halo -d sku=qwerty -d plataforma=Xbox -d descripcion=hola
    @PostMapping(path="/add")
    public @ResponseBody String addNewVJ(
            @RequestParam String nombreVJ,
            @RequestParam String sku,
            @RequestParam String plataforma,
            @RequestParam String descripcion
    )
    {
        videojuegos v = new videojuegos();
        v.setNombreVJ(nombreVJ);
        v.setSku(sku);
        v.getPlataforma(plataforma);
        v.getDescripcion(descripcion);
        videojuegosRepositorio.save(v);
        return "Se guardaron los datos";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<videojuegos> getAllUsers() {
        // This returns a JSON or XML with the users
        return videojuegosRepositorio.findAll();
    }
}

