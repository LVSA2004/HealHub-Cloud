package br.com.fiap.healhub.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DialogService {
    @Autowired
    DialogRepository repository;

    public Dialog save(String title){
        Dialog dialog = new Dialog();
        dialog.setTitle(title);
        repository.save(dialog);
        return dialog;
    }

    public List<Dialog> findAll(){
        return repository.findAll();
    }

}
