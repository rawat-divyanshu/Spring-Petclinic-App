package com.rawatdivyanshu.petclinic.Services;

import com.rawatdivyanshu.petclinic.Models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
