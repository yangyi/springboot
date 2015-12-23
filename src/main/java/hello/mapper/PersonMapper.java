package hello.mapper;

import org.apache.ibatis.annotations.Insert;

/**
 * Created by joeyang on 12/23/15.
 */
public interface PersonMapper {
    @Insert("INSERT into PERSON(ID, NAME) VALUES (#{ID}, #{NAME})")
    void create(Person person);

    @Insert("Insert into PERSON(ID, NAME) VALUES (#{id}, #{name})")
    void insert(AbstractPeople people);
}
