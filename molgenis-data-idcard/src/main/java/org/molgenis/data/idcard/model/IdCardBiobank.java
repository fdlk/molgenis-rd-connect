package org.molgenis.data.idcard.model;

import org.molgenis.data.Entity;
import org.molgenis.data.meta.model.EntityType;

import static org.molgenis.data.idcard.model.IdCardBiobankOrRegistryMetadata.ORGANIZATION_ID;

public class IdCardBiobank extends IdCardBiobankOrRegistry
{
	public IdCardBiobank(Entity entity)
	{
		super(entity);
	}

	public IdCardBiobank(EntityType entityType)
	{
		super(entityType);
	}

	public IdCardBiobank(Integer identifier, EntityType entityType)
	{
		super(entityType);
		set(ORGANIZATION_ID, identifier);
	}
}
