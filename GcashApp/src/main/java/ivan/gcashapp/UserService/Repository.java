package ivan.gcashapp.UserService;

import org.springframework.data.jpa.repository.JpaRepository;
import ivan.gcashapp.UserService.Repository;
public interface Repository extends JpaRepository<Registration, Long> {
}
