package ru.netology.homework_spring_boot_purpose_internal_structure_v1.devProfile;

import ru.netology.homework_spring_boot_purpose_internal_structure_v1.systemProfile.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
