package org.crud.generic.controller;

import org.crud.generic.entity.User;
import org.crud.generic.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

	@Autowired
	private EntityService<User, Long> userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void saveEntity() {

		User user = new User("pawam");
		userService.saveEntity(user);

	}

}
