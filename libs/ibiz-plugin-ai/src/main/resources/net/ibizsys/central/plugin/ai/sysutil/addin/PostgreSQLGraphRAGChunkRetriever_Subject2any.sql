WITH src_entity AS (SELECT *
                    FROM ai_kb_graph_entity
                    WHERE kb_id = ?
                      and id in ({entity_id})),
     layer1 AS (SELECT sub.id                 AS src_entity_id,
                       sub.name               AS src_entity_name,
                       sub.type               AS src_entity_type,
                       sub.description        AS src_entity_description,
                       sub.description_vector AS src_entity_description_vector,
                       r2.id                  AS relation_id,
                       r2.name                as relation_name,
                       r2.description         as relation_description,
                       r2.description_vector  as relation_description_vector,
                       r2.id                  as relation_path,
                       obj.id                 AS dst_entity_id,
                       obj.name               AS dst_entity_name,
                       obj.type               AS dst_entity_type,
                       obj.description        as dst_entity_description,
                       obj.description_vector as dst_entity_description_vector
                FROM ai_kb_graph_relation r2
                         JOIN src_entity ON (r2.subject_id = src_entity.id)
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id
                union all
                SELECT obj.id                 AS src_entity_id,
                       obj.name               AS src_entity_name,
                       obj.type               AS src_entity_type,
                       obj.description        AS src_entity_description,
                       obj.description_vector AS src_entity_description_vector,
                       r2.id                  AS relation_id,
                       r2.name                as relation_name,
                       r2.description         as relation_description,
                       r2.description_vector  as relation_description_vector,
                       r2.id                  as relation_path,
                       sub.id                 AS dst_entity_id,
                       sub.name               AS dst_entity_name,
                       sub.type               AS dst_entity_type,
                       sub.description        as dst_entity_description,
                       sub.description_vector as dst_entity_description_vector
                FROM ai_kb_graph_relation r2
                         JOIN src_entity ON (r2.object_id = src_entity.id)
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id),
     layer2 AS (SELECT sub.id                               AS src_entity_id,
                       sub.name                             AS src_entity_name,
                       sub.type                             AS src_entity_type,
                       sub.description                      AS src_entity_description,
                       sub.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer1.relation_path || '/' || r2.id as relation_path,
                       obj.id                               AS dst_entity_id,
                       obj.name                             AS dst_entity_name,
                       obj.type                             AS dst_entity_type,
                       obj.description                      as dst_entity_description,
                       obj.description_vector               as dst_entity_description_vector
                FROM layer1
                         JOIN ai_kb_graph_relation r2 ON r2.subject_id = layer1.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id
                union all
                SELECT obj.id                               AS src_entity_id,
                       obj.name                             AS src_entity_name,
                       obj.type                             AS src_entity_type,
                       obj.description                      AS src_entity_description,
                       obj.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer1.relation_path || '/' || r2.id as relation_path,
                       sub.id                               AS dst_entity_id,
                       sub.name                             AS dst_entity_name,
                       sub.type                             AS dst_entity_type,
                       sub.description                      as dst_entity_description,
                       sub.description_vector               as dst_entity_description_vector
                FROM layer1
                         JOIN ai_kb_graph_relation r2 ON r2.object_id = layer1.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id),
     layer3 AS (SELECT sub.id                               AS src_entity_id,
                       sub.name                             AS src_entity_name,
                       sub.type                             AS src_entity_type,
                       sub.description                      AS src_entity_description,
                       sub.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer2.relation_path || '/' || r2.id as relation_path,
                       obj.id                               AS dst_entity_id,
                       obj.name                             AS dst_entity_name,
                       obj.type                             AS dst_entity_type,
                       obj.description                      as dst_entity_description,
                       obj.description_vector               as dst_entity_description_vector
                FROM layer2
                         JOIN ai_kb_graph_relation r2 ON r2.subject_id = layer2.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id
                union all
                SELECT obj.id                               AS src_entity_id,
                       obj.name                             AS src_entity_name,
                       obj.type                             AS src_entity_type,
                       obj.description                      AS src_entity_description,
                       obj.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer2.relation_path || '/' || r2.id as relation_path,
                       sub.id                               AS dst_entity_id,
                       sub.name                             AS dst_entity_name,
                       sub.type                             AS dst_entity_type,
                       sub.description                      as dst_entity_description,
                       sub.description_vector               as dst_entity_description_vector
                FROM layer2
                         JOIN ai_kb_graph_relation r2 ON r2.object_id = layer2.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id),
     layer4 AS (SELECT sub.id                               AS src_entity_id,
                       sub.name                             AS src_entity_name,
                       sub.type                             AS src_entity_type,
                       sub.description                      AS src_entity_description,
                       sub.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer3.relation_path || '/' || r2.id as relation_path,
                       obj.id                               AS dst_entity_id,
                       obj.name                             AS dst_entity_name,
                       obj.type                             AS dst_entity_type,
                       obj.description                      as dst_entity_description,
                       obj.description_vector               as dst_entity_description_vector
                FROM layer3
                         JOIN ai_kb_graph_relation r2 ON r2.subject_id = layer3.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id
                union all
                SELECT obj.id                               AS src_entity_id,
                       obj.name                             AS src_entity_name,
                       obj.type                             AS src_entity_type,
                       obj.description                      AS src_entity_description,
                       obj.description_vector               AS src_entity_description_vector,
                       r2.id                                AS relation_id,
                       r2.name                              as relation_name,
                       r2.description                       as relation_description,
                       r2.description_vector                as relation_description_vector,
                       layer3.relation_path || '/' || r2.id as relation_path,
                       sub.id                               AS dst_entity_id,
                       sub.name                             AS dst_entity_name,
                       sub.type                             AS dst_entity_type,
                       sub.description                      as dst_entity_description,
                       sub.description_vector               as dst_entity_description_vector
                FROM layer3
                         JOIN ai_kb_graph_relation r2 ON r2.object_id = layer3.dst_entity_id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id),
     relation AS (select distinct *
                  from (select *
                        from layer1
                        UNION ALL
                        select*
                        from layer2
                        UNION ALL
                        select *
                        from layer3
                        UNION ALL
                        select *
                        from layer4) as result
                  where (1.0 - (relation_description_vector <=> '{description_vector}') / 2) > 0.5)
select *
from ai_kb_graph_relation
where EXISTS (SELECT 1
              FROM relation
              WHERE ai_kb_graph_relation.id = ANY (string_to_array(relation.relation_path, '/')));