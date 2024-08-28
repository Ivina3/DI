package org.example;

import org.example.interfeces.IRepository;
import org.example.interfeces.IService;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Container container = new Container();

        container.register(IRepository.class, RepositoryA.class);
        container.register(IService.class, ServiceA.class);

        IService service = container.Resolve(IService.class);
        IRepository service2 =container.Resolve(IRepository.class);
        service2.Add(service.create(new Person("asd",12,12)));
        service2.Add(service.create(new Person("asd",12,12)));
        System.out.println(service2.GetAll());
    }
}