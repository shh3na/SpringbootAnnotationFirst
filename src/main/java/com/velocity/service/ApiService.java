package com.velocity.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.velocity.model.Policy;

@Service
public class ApiService implements IApiInterfImp {

	List<Policy> list = new ArrayList<Policy>();
      
	public ApiService() {
		Policy l = new Policy();

		l.setId(1);
		l.setPolicyname("term policy");
		l.setPolicyage(5);
		l.setPolicydisc("policy");

		Policy l2 = new Policy();

		l2.setId(2);
		l2.setPolicyname("fixed policy");
		l2.setPolicyage(2);
		l2.setPolicydisc("policy");
		
		list.add(l);
		list.add(l2);
	}

	@Override
	public List<Policy> getall() {
		return this.list;

	}

	@Override
	public void create(Policy p) {
		list.add(p);

	}

	@Override
	public void update(Integer id,Policy a) {

		for (Policy p : list) {

			if (p.getId() == id) {
				p.setPolicyname(a.getPolicyname());
				p.setPolicyage(a.getPolicyage());
				p.setPolicydisc(a.getPolicydisc());
				
			}

		}

	}

	@Override
	public void delete(Integer id) {

		Iterator<Policy> iter = list.iterator();

		while(iter.hasNext()) {
			Policy policy = iter.next();
			if (policy.getId()==id) {
				iter.remove();
			}
		}

	}
}
