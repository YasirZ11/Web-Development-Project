package com.project.Findmine.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;
import com.project.Findmine.repository.FindMineRepository;

@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	    private FindMineRepository findMineRepository;

	    @Override
	    public User saveUser(User user){
	    return findMineRepository.save(user);
	    }

	    @Override
	    public User updateUser(User user){
	        return findMineRepository.save(user);
	    }

	    @Override
	    public void deleteUser(User findMine){
	        findMineRepository.delete(findMine);
	    }
	    	


	    public FindMineRepository getFindMineRepository() {
	        return findMineRepository;
	    }

	    public void setFindMineRepository(FindMineRepository findMineRepository) {
	        this.findMineRepository = findMineRepository;
	    }

		@Override
		public void getItemByLocation(Item location) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void saveItem(Item item) {
			return ;			
		}

}
