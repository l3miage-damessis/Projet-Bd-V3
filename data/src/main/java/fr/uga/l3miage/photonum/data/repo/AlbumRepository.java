package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Album;
import jakarta.persistence.EntityManager;

public class AlbumRepository implements CRUDRepository<Long,Album> {

        private final EntityManager entityManager;
    
        @Autowired
        public AlbumRepository(EntityManager entityManager) {
            this.entityManager = entityManager;
        }
        @Override
        public Album save(Album album) {
            entityManager.persist(album);
            return album;
        }
    
        @Override
        public Album get(Long id) {
            return entityManager.find(Album.class, id);
        }
    
        @Override
        public void delete(Album album) {
            entityManager.remove(album);
        }
        // recuperations de tous les albums
        @Override
        public List<Album> all() {
            return null;
        }
        
        
}
