package com.arantes.publication.mapper;

import com.arantes.publication.controller.request.PublicationRequest;
import com.arantes.publication.domain.Publication;
import com.arantes.publication.repository.entity.PublicationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicationMapper {

    PublicationEntity toPublicationEntity(Publication publication);

    Publication toPublication(PublicationEntity publicationEntity);

    Publication toPublication(PublicationRequest publicationRequest);

}
