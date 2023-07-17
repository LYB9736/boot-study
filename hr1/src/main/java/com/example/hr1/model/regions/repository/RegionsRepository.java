package com.example.hr1.model.regions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hr1.model.regions.entity.RegionsEntity;



@Repository
public interface RegionsRepository extends JpaRepository<RegionsEntity, Integer> {
    // 특정 엔티티 단일 데이터 가져오기
    // select * from regions where region_id = ?
    RegionsEntity findByRegionId(Integer regionId);


    // RegionsEntity findByRegionName(String regionName);
    // region_name은 유니크하지 않기 때문에 여러개를 가져올 수 있다.
    // List 타입으로 가져와야한다.
    List<RegionsEntity> findByRegionName(String regionName);

    // region_id와 region_name이 둘 다 조건에 맞을 때 == 단일값
    // find - select * from regions
    // by - where
    // and - and
    RegionsEntity findByRegionIdAndRegionName(Integer regionId, String regionName);
    
    
}