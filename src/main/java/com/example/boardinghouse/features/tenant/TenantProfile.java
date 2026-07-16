package com.example.boardinghouse.features.tenant;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tenant_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TenantProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "cccd_number", length = 20)
    private String cccdNumber;

    @Column(name = "cccd_front_img", length = 500)
    private String cccdFrontImg;

    @Column(name = "cccd_back_img", length = 500)
    private String cccdBackImg;

    @Column(name = "is_active")
    @Builder.Default
    private Boolean isActive = true;
}
