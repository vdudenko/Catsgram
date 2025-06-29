package ru.yandex.practicum.catsgram.model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;
}
