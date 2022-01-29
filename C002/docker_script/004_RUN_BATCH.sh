docker run -itd --name docker_batch_app \
    --network docker_batch_network \
    -e SPRING_PROFILES_ACTIVE=docker \
    -v /DB/mysql/c001:/var/lib/mysql \
    docker_batch_app_image
