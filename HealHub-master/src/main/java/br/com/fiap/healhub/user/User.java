package br.com.fiap.healhub.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    String email_id;
    String name;
    String password;
    String telefone;
    String avatarUrl;
    String mail;

}
