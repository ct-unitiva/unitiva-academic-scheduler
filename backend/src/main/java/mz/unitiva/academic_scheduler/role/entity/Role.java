package mz.unitiva.academic_scheduler.role.entity;

import jakarta.persistence.*;
import lombok.*;
import mz.unitiva.academic_scheduler.common.entity.AuditableEntity;
import mz.unitiva.academic_scheduler.role.entity.Role;
import mz.unitiva.academic_scheduler.role.entity.RoleName;

/**
 * Represents a security role used for authorization.
 */
@Entity
@Table(name = "roles")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true, length = 50)
    private RoleName name;

    @Column(length = 255)
    private String description;

    @Builder.Default
    @Column(nullable = false)
    private Boolean active = true;
}