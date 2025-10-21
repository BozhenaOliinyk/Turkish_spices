package com.example.mahasun.service;

import com.example.mahasun.entity.TypBonusnoiKartky;
import com.example.mahasun.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryManager {

    @Autowired private KlyentRepository klyentRepository;
    @Autowired private PracivnykRepository pracivnykRepository;
    @Autowired private TorhovaTochkaRepository torhovaTochkaRepository;
    @Autowired private TypBonusnoiKartkyRepository typBonusnoiKartkyRepository;

    public KlyentRepository klyenty() { return klyentRepository; }
    public PracivnykRepository pracivnyky() { return pracivnykRepository; }
    public TorhovaTochkaRepository torhoviTochky() { return torhovaTochkaRepository; }
    public TypBonusnoiKartkyRepository bonusniKartky() { return typBonusnoiKartkyRepository; }
}
