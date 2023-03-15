 package com.roberto.universidad.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.roberto.universidad.model.Usuario;



@Service
public class UserService {

    @Value("${url.seguridad.rest.service}")
    String urlApi;

    @Autowired
    RestTemplate restTemplate;

   /*  public Usuario createUsuario(Usuario user) {
        return userRepository.save(user);
    }

    public Usuario updateUsuario(Usuario user) {
        return userRepository.save(user);
    }

    public void deleteUsuario(Long userId) {
        userRepository.deleteById(userId);
    }

    public Usuario getUsuario(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public List<Usuario> getAllUsuarios() {
        return userRepository.findAll();
    } */

     @Override
    public Usuario loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Usuario usuario = restTemplate.getForObject(urlApi + "buscar/" + username, Usuario.class);
    

        return  usuario;
    } 

}
 