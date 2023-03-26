package com.example.demo.distributionCharge.enseignant;

import com.example.demo.Doa.EnseignantRepository;
import com.example.demo.entities.Enseignant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChargeEnseignantServices {
    private final EnseignantRepository enseignantRepository;


    public Enseignant getEnseignant(Long userId) {
        Enseignant enseignant=enseignantRepository.findById(userId).orElseThrow(()->new IllegalStateException(("User does not exist")));
        return enseignant;
    }

    public List<Enseignant> getEnseignants() {
        return enseignantRepository.findAll();
    }

    public void signupEnseignant(Enseignant enseignant) {
        Optional<Enseignant> enseignantOptional= enseignantRepository.chargeFindEnseignantByCin(enseignant.getCin());
        if(enseignantOptional.isPresent()){
            throw new IllegalStateException("Enseignant Exists");
        }
        enseignantRepository.save(enseignant);
    }


    public void deleteEnseignant(Long enseignantId) {
        boolean exists=enseignantRepository.existsById(enseignantId);
        if(!exists){
            throw new IllegalStateException("Enseignant with id"+enseignantId+" does not exists");
        }
        enseignantRepository.deleteById(enseignantId);

    }

    public void updateEnseignant(Long enseignantId, String phone, String email) {

        Enseignant enseignant=enseignantRepository.findById(enseignantId).orElseThrow(()->new IllegalStateException(("Enseignant does not exist")));

        if(phone !=null && phone.length()>0 && !Objects.equals(enseignant.getTelephone(),phone))
        {
            enseignant.setTelephone(phone);
        }
        if(email !=null && email.length()>0 && !Objects.equals(enseignant.getEmail(),email))
        {
            Optional<Enseignant> userOptional =enseignantRepository.chargeFindEnseignantByEmail(email);
            if(userOptional.isPresent())
            {
                throw new IllegalStateException("email taken");
            }
            enseignant.setEmail(email);
        }
    }
}
