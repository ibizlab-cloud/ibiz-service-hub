WITH object AS (SELECT *
                 FROM ai_kb_graph_entity
                 WHERE kb_id = ?
                 and id in ({entity_id})),
--一层
     layer1 AS (SELECT sub.id                 AS subject_id,
                       sub.name               AS subject_name,
                       sub.type               AS subject_type,
                       sub.description        as subject_description,
                       sub.description_vector AS subject_description_vector,
                       r2.id                  AS relation_id,
                       r2.name                as relation_name,
                       r2.description         as relation_description,
                       r2.description_vector  as relation_description_vector,
                       obj.id                 AS object_id,
                       obj.name               AS object_name,
                       obj.type               AS object_type
                FROM ai_kb_graph_relation r2
                         JOIN object ON r2.object_id = object.id
                         JOIN ai_kb_graph_entity sub ON r2.subject_id = sub.id
                         JOIN ai_kb_graph_entity obj ON r2.object_id = obj.id
                where r2.subject_id <> r2.object_id),
--二层
     layer2 AS (SELECT e_final.id                 AS subject_id,
                       e_final.name               AS subject_name,
                       e_final.type               AS subject_type,
                       e_final.description        as subject_description,
                       e_final.description_vector AS subject_description_vector,
                       r2.id                      AS relation_id2,
                       r2.name                    AS relation_name2,
                       r2.description             as relation_description2,
                       r2.description_vector      as relation_description_vector2,
                       layer1.subject_id          AS middle_id,
                       layer1.subject_name        AS middle_name,
                       layer1.subject_type        AS middle_type,
                       layer1.relation_id,
                       layer1.relation_name,
                       layer1.object_id,
                       layer1.object_name,
                       layer1.object_type
                FROM layer1
                         JOIN ai_kb_graph_relation r2 ON r2.object_id = layer1.subject_id
                         JOIN ai_kb_graph_entity e_final ON r2.subject_id = e_final.id
                where r2.subject_id <> r2.object_id),
--三层
     layer3 AS (SELECT e_final.id                 AS subject_id,
                       e_final.name               AS subject_name,
                       e_final.type               AS subject_type,
                       e_final.description        as subject_description,
                       e_final.description_vector AS subject_description_vector,
                       r2.id                      AS relation_id3,
                       r2.name                    AS relation_name3,
                       r2.description             as relation_description3,
                       r2.description_vector      as relation_description_vector3,
                       layer2.subject_id          AS middle2_id,
                       layer2.subject_name        AS middle2_name,
                       layer2.subject_type        AS middle2_type,
                       layer2.relation_id2,
                       layer2.relation_name2,
                       layer2.middle_id,
                       layer2.middle_name,
                       layer2.middle_type,
                       layer2.relation_id,
                       layer2.relation_name,
                       layer2.middle_id,
                       layer2.middle_name,
                       layer2.middle_type,
                       layer2.relation_id2,
                       layer2.relation_name2,
                       layer2.object_id,
                       layer2.object_name,
                       layer2.object_type
                FROM layer2
                         JOIN ai_kb_graph_relation r2 ON r2.object_id = layer2.subject_id
                         JOIN ai_kb_graph_entity e_final ON r2.subject_id = e_final.id
                where r2.subject_id <> r2.object_id),
     relation as (select distinct *
                  from (select relation_id                 as id,
                               relation_name               as name,
                               relation_description        as description,
                               relation_description_vector as description_vector,
                               subject_id,
                               subject_name,
                               subject_description,
                               subject_description_vector,
                               object_id,
                               object_name
                        from layer1
                        UNION ALL
                        select relation_id2                 as id,
                               relation_name2               as name,
                               relation_description2        as description,
                               relation_description_vector2 as description_vector,
                               subject_id,
                               subject_name,
                               subject_description,
                               subject_description_vector,
                               middle_id                    as object_id,
                               middle_name                  as object_name
                        from layer2
                        UNION ALL
                        select relation_id3                 as id,
                               relation_name3               as name,
                               relation_description3        as description,
                               relation_description_vector3 as description_vector,
                               subject_id,
                               subject_name,
                               subject_description,
                               subject_description_vector,
                               middle2_id                   as object_id,
                               middle2_name                 as object_name
                        from layer3) as result
                  --关系条件，目标条件   向量
                  where subject_id in ({subject_id})
     )
-- select *
-- from relation;
select *
from ai_kb_chunk
where id in (select chunk_id
             from ai_kb_graph_relation_chunk
             where relation_id in (select id
                                   from relation));